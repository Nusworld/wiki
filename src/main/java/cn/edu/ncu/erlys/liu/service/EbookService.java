package cn.edu.ncu.erlys.liu.service;

import cn.edu.ncu.erlys.liu.mapper.EbookMapper;
import cn.edu.ncu.erlys.liu.pojo.Ebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }

}
