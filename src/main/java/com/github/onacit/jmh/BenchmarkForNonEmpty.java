package com.github.onacit.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

@BenchmarkMode(Mode.Throughput)
public class BenchmarkForNonEmpty {

    @Benchmark
    public void springStringUtilsHasTextWithNonEmpty() {
        final boolean result = org.springframework.util.StringUtils.hasText("a");
    }

    @Benchmark
    public void commonsStringUtilsIsEmptyWithNonEmpty() {
        final boolean result = org.apache.commons.lang3.StringUtils.isEmpty("a");
    }

    @Benchmark
    public void guavaStringsIsNullOrEmptyWithNonEmpty() {
        final boolean result = com.google.common.base.Strings.isNullOrEmpty("a");
    }
}
