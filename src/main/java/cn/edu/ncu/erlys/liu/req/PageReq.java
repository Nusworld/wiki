package cn.edu.ncu.erlys.liu.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageReq {

    private Integer page;

    private Integer size;


}