package cn.edu.ncu.erlys.liu.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EbookResp {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;

}