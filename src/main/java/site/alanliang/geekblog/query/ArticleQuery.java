package site.alanliang.geekblog.query;

import lombok.Data;

import java.util.Date;

/**
 * @Descriptin TODO
 * @Author AlanLiang
 * Date 2020/5/3 16:25
 * Version 1.0
 **/
@Data
public class ArticleQuery {
    private String title;

    private Integer type;

    private Long categoryId;

    private Boolean published;

    private Date startDate;

    private Date endDate;
}
