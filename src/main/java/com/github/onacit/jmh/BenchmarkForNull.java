package com.github.onacit.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

@BenchmarkMode(Mode.Throughput)
public class BenchmarkForNull {

    @Benchmark
    public void springStringUtilsHasTextWithNull() {
        org.springframework.util.StringUtils.hasText(null);
    }

    @Benchmark
    public void commonsStringUtilsIsEmptyWithNull() {
        org.apache.commons.lang3.StringUtils.isEmpty(null);
    }

    @Benchmark
    public void guavaStringsIsNullOrEmptyWithNull() {
        com.google.common.base.Strings.isNullOrEmpty(null);
    }
}
