package cn.edu.ncu.erlys.liu.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResp<T> {

    private long total;

    private List<T> list;

}