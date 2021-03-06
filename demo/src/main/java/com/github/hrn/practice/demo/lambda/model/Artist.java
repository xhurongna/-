package com.github.hrn.practice.demo.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author 胡荣娜
 * @date 2020-01-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Artist {
    private String name;
    private Stream<Artist> members;
    private String origin;
}
