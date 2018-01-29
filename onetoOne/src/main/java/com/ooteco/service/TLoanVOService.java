package com.ooteco.service;

import com.ooteco.entity.tloan.model.TLoanVO;

import java.util.List;

/**
 * Created by zk on 2017/7/25.
 */
public interface TLoanVOService {
    List<TLoanVO> findIsNotAllocationCompleteLists(List<Integer> alreadyAllocation,Integer phase,Integer lmd);

    void update(TLoanVO tLoanVO);
}
