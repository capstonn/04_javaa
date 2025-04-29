package v20250429.ch15.sec02.exam01;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Board {
    private String subject;
    private String content;
    private String writer;
}
