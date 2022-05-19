package io.github.ealenxie.wechat.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Markdown {
    private String content;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mentioned_list")
    private String[] mentionedList;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mentioned_mobile_list")
    private String[] mentionedMobileList;
}