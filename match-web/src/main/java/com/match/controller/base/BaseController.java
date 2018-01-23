package com.match.controller.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.collect.Maps;
import com.match.utils.VelocityUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.Context;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Map;


/**
 * BaseController
 *
 * @author waii
 * @since 2018-01-11
 */
public abstract class BaseController {

    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    private static final String DEFAULT_LAYOUT = "layout.default.template";

    private static final String ERROR_TEMPLATE = "layout.error.template";

    private static final String BLANK_TEMPLATE = "layout.blank.template";

    private static final String CONTENT_TYPE = "contentType";

    private static final String KEY_SCREEN_CONTENT = "screen_content";

    private static final String KEY_EXCEPTION = "exception";

    private static final String KEY_TOOLS = "tools";

    protected static final String KEY_DATA = "data";

    protected static final String KEY_MSG = "msgAlert";

    private static final String VM_SUFFIX = ".vm";

    protected static final String JSON_SUFFIX = ".json";

    @Resource
    protected ServletContext servletContext;

    @Resource
    protected HttpServletRequest request;

//    @Resource
//    protected HttpServletResponse response;

    @Resource
    private VelocityConfigurer velocityConfigurer;


    /**
     * 获取输入编码
     *
     * @return
     */
    protected String getInputEncoding() {
        Object encoding = getVelocityEngine().getProperty(
                VelocityEngine.INPUT_ENCODING);
        return (String) (encoding == null ? "UTF-8" : encoding);
    }

    /**
     * 获取输出编码
     *
     * @return
     */
    protected String getOutputEncoding() {
        Object encoding = getVelocityEngine().getProperty(
                VelocityEngine.OUTPUT_ENCODING);
        return (String) (encoding == null ? "UTF-8" : encoding);
    }


    /**
     * 错误模板
     *
     * @param context   模板数据
     * @param exception 异常内容
     * @return
     */
    protected ModelAndView toErrorVM(Map<String, Object> context,
                                     Exception exception) {
        VelocityEngine engine = getVelocityEngine();
        String view = (String) engine.getProperty(ERROR_TEMPLATE);
        if (context == null) {
            context = getDefaultContext();
        } else {
            context.putAll(getDefaultContext());
        }
        context.put(KEY_EXCEPTION, exception);
        return new ModelAndView(view, context);
    }

    protected ModelAndView toErrorVM(Exception exception) {
        return toErrorVM(null, exception);
    }

    protected ModelAndView showMesage(String data) {
        Map<String, Object> map = getDefaultContext();
        map.put(KEY_MSG, data);
        return toVM("common/showMsg", map, true);
    }

    /**
     * 输出JSON信息
     *
     * @param data
     * @return
     */
    protected ModelAndView toJSON(HttpServletResponse response, Object data) {
        ModelAndView view = null;
        try {
            response.setCharacterEncoding(getOutputEncoding());
            response.setContentType("text/plain;charset="
                    + response.getCharacterEncoding());
            Writer writer = response.getWriter();
            writer.write(JSON.toJSONString(data));
            writer.flush();
            writer.close();
        } catch (Exception e) {
            Map<String, Object> context = getDefaultContext();
            context.put(KEY_DATA, data);
            view = toErrorVM(context, e);
            LOG.error("输出JSON发生异常...", e);
        }
        return view;
    }

    protected ModelAndView toJSON(Object data) {
        ModelAndView view = null;
        try {
            VelocityEngine engine = getVelocityEngine();
            view = toDataOnly(
                    (String) engine.getProperty(BLANK_TEMPLATE),
                    JSON.toJSONString(data, SerializerFeature.BrowserCompatible));
        } catch (Exception e) {
            Map<String, Object> context = getDefaultContext();
            context.put(KEY_DATA, data);
            view = toErrorVM(context, e);
            LOG.error("输出JSON发生异常...", e);
        }
        return view;
    }

    /**
     * 仅仅输出数据信息,扩展实现
     *
     * @param view 视图
     * @param data 数据
     * @return
     */
    protected ModelAndView toDataOnly(String view, Object data) {
        ModelAndView viewModel = null;
        try {
            // 判断模板是否存在
            boolean exists = getVelocityEngine().resourceExists(
                    view + VM_SUFFIX);
            if (!exists) {
                throw new ResourceNotFoundException("未找到指定模板[" + view + "].");
            }
            viewModel = new ModelAndView(view, KEY_DATA, data);
        } catch (Exception e) {
            Map<String, Object> context = getDefaultContext();
            context.put(KEY_DATA, data);
            viewModel = toErrorVM(context, e);
            LOG.error("输出数据发生异常...", e);
        }
        return viewModel;
    }

    protected ModelAndView toDataOnly(Object data) {
        return toDataOnly(
                (String) getVelocityEngine().getProperty(BLANK_TEMPLATE), data);
    }

    /**
     * 输出VM模板
     *
     * @param view 视图
     * @return
     */
    protected ModelAndView toVM(String view) {
        return toVM(view, null);
    }

    /**
     * 输出VM模板
     *
     * @param view       视图
     * @param skipLayout 跳过布局
     * @return
     */
    protected ModelAndView toVM(String view, boolean skipLayout) {
        return toVM(view, null, skipLayout);
    }

    /**
     * 输出VM模板
     *
     * @param view       视图
     * @param data       数据
     * @param skipLayout 跳过布局
     * @return
     */
    @SuppressWarnings("unchecked")
    protected ModelAndView toVM(String view, Object data, boolean skipLayout) {
        VelocityEngine ve = getVelocityEngine();
        Map<String, Object> context = getDefaultContext();

        ModelAndView viewModel = null;
        try {
            // 判断模板是否存在
            boolean exists = ve.resourceExists(view + VM_SUFFIX);
            if (!exists) {
                throw new ResourceNotFoundException("未找到指定模板[" + view + "].");
            }
            // 添加默认数据
            if (data instanceof Map) {
                context.putAll((Map<String, Object>) data);
            } else {
                context.put(KEY_DATA, data);
            }

            if (skipLayout) {// 跳过模板直接输出
                return new ModelAndView(view, context);
            }

            // 输入输出编码
            Template bodyVM = ve.getTemplate(view + VM_SUFFIX,
                    getInputEncoding());

            if (LOG.isDebugEnabled()) {
                LOG.debug("process vm=============={}", bodyVM.getName());
            }

            // 合并screen_content
            StringWriter screenContent = new StringWriter();
            bodyVM.merge(mapToContext(context), screenContent);

            // 添加到默认布局中
            context.put(KEY_SCREEN_CONTENT, screenContent.toString());
            // 读取模板
            String layout = (String) ve.getProperty(DEFAULT_LAYOUT);
            viewModel = new ModelAndView(layout, context);
        } catch (Exception e) {
            viewModel = toErrorVM(context, e);
            LOG.error("输出VM发生异常...", e);
        }

        return viewModel;
    }

    /**
     * 获取Velocity模板引擎
     *
     * @return
     */
    private VelocityEngine getVelocityEngine() {
        return velocityConfigurer.getVelocityEngine();
    }

    /**
     * 获取默认数据
     *
     * @return
     */
    private Map<String, Object> getDefaultContext() {
        Map<String, Object> context = Maps.newHashMap();
        // 扩展实现
        VelocityEngine engine = getVelocityEngine();
        context.put(CONTENT_TYPE, engine.getProperty(CONTENT_TYPE));// 页面编码
        // VelocityTools 可放单例实例对象或者静态类
        context.put(KEY_TOOLS, VelocityUtil.class);
        context.put("basePath", request.getContextPath());
        return context;
    }

    /**
     * Map转换为Context
     *
     * @param mapData
     * @return
     */
    private Context mapToContext(Map<String, Object> mapData) {
        return new VelocityContext(mapData);
    }



    protected boolean isAjaxRequest() {
        return request.getHeader("X-Requested-With") != null;
    }

    /**
     * 输出VM模板(对于ajax请求，直接返回；其它请求则需要组装模板)
     *
     * @param view 视图
     * @param data 数据
     * @return
     */
    @SuppressWarnings("unchecked")
    protected ModelAndView toVM(String view, Object data) {
        VelocityEngine ve = getVelocityEngine();
        Map<String, Object> context = getDefaultContext();

        ModelAndView viewModel = null;
        try {
            // 判断模板是否存在
            boolean exists = ve.resourceExists(view + VM_SUFFIX);
            if (!exists) {
                throw new ResourceNotFoundException("未找到指定模板[" + view + "].");
            }
            // 添加默认数据
            if (data instanceof Map) {
                context.putAll((Map<String, Object>) data);
            } else {
                context.put(KEY_DATA, data);
            }
            // 跳过模板直接输出
            if (isAjaxRequest()) {
                return new ModelAndView(view, context);
            }

            // 输入输出编码
            Template bodyVM = ve.getTemplate(view + VM_SUFFIX,
                    getInputEncoding());

            // 合并screen_content
            StringWriter screenContent = new StringWriter();
            bodyVM.merge(mapToContext(context), screenContent);

            // 添加到默认布局中
            context.put(KEY_SCREEN_CONTENT, screenContent.toString());
            // 读取模板
            String layout = (String) ve.getProperty(DEFAULT_LAYOUT);
            viewModel = new ModelAndView(layout, context);
        } catch (Exception e) {
            viewModel = toErrorVM(context, e);
            LOG.error("输出VM发生异常...", e);
        }

        return viewModel;
    }


    /**
     * @param
     * @Description: 对请求路径按照路径符号进行拆分，返回字符数组
     */
    protected String[] arrayHandlerMappingPath() {
        String pathWithHanderMapping = (String) request
                .getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        // 注意数组的第一个元素为空字符，所需要的字符从下标1开始
        String[] pathArray = pathWithHanderMapping.split("/");
        return pathArray;
    }

    /**
     * @param parms
     * @return
     * @Description: 根据字符数组返回组装后的redirect ModelAndView
     */
    protected ModelAndView redirectView(String... parms) {
        int length = parms.length;
        if (length > 0) {
            StringBuffer sb = new StringBuffer();
            sb.append("redirect:/");
            for (String param : parms) {
                try {
                    sb.append(URLEncoder.encode(param, "utf-8") + "/");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            // 删除最后一个"/"
            sb.delete(sb.length() - 1, sb.length());
            return new ModelAndView(sb.toString());
        }
        return null;
    }

    /**
     * @param parms
     * @return
     * @Description: 根据字符数组返回组装后的redirect ModelAndView
     */
    protected ModelAndView redirectView(Map<String, ?> model, String... parms) {
        int length = parms.length;
        if (length > 0) {
            StringBuffer sb = new StringBuffer();
            sb.append("redirect:/");
            for (String param : parms) {
                try {
                    sb.append(URLEncoder.encode(param, "utf-8") + "/");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            sb.delete(sb.length() - 1, sb.length());
            return new ModelAndView(sb.toString(), model);
        }
        return null;
    }

    protected Map<String, Object> buildRespMap(boolean success, String info) {
        Map<String, Object> map = Maps.newHashMap();
        if (success) {
            map.put("success", "true");
        } else {
            map.put("success", "false");
        }

        if (info != null && !info.isEmpty()) {
            map.put("info", info);
        }

        return map;
    }

    /**
     * @return
     * @Description: 系统错误
     */
    protected ModelAndView errorVm(Object data) {
        return toVM("common/error", data);
    }

    /**
     * @return
     * @Description: 系统出现错误，ExceptionResolver到此方法
     */
    public ModelAndView error(Object data) {
        return errorVm(data);
    }



}
