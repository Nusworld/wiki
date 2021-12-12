package cn.edu.ncu.erlys.liu.service;

import cn.edu.ncu.erlys.liu.mapper.EbookMapper;
import cn.edu.ncu.erlys.liu.pojo.Ebook;
import cn.edu.ncu.erlys.liu.pojo.EbookExample;
import cn.edu.ncu.erlys.liu.req.EbookReq;
import cn.edu.ncu.erlys.liu.resp.EbookResp;
import cn.edu.ncu.erlys.liu.util.CopyUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        PageHelper.startPage(1, 3);
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

//        return ebooksList
//                .stream()
//                .map((e)->{
//                    EbookResp resp = new EbookResp();
//                    BeanUtils.copyProperties(e, resp);
//                    return resp;
//                })
//                .collect(Collectors.toList());
        return CopyUtil.copyList(ebooksList, EbookResp.class);
    }

}
