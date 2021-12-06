package cn.edu.ncu.erlys.liu.controller;

import cn.edu.ncu.erlys.liu.req.EbookReq;
import cn.edu.ncu.erlys.liu.resp.CommonResp;
import cn.edu.ncu.erlys.liu.resp.EbookResp;
import cn.edu.ncu.erlys.liu.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setData(list);
        return resp;
    }

}
