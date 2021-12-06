package cn.edu.ncu.erlys.liu.service;

import cn.edu.ncu.erlys.liu.mapper.EbookMapper;
import cn.edu.ncu.erlys.liu.pojo.Ebook;
import cn.edu.ncu.erlys.liu.pojo.EbookExample;
import cn.edu.ncu.erlys.liu.req.EbookReq;
import cn.edu.ncu.erlys.liu.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

        return ebooksList
                .stream()
                .map((e)->{
                    EbookResp resp = new EbookResp();
                    BeanUtils.copyProperties(e, resp);
                    return resp;
                })
                .collect(Collectors.toList());
    }

}
