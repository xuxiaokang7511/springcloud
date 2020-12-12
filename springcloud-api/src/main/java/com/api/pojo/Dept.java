package com.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private Long deptno;

    private String dname;

    private String dbSource;
}
