package com.firealgo.javastreams.emp.rest;

import com.firealgo.javastreams.entity.Emp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/streams")
public class StreamDemoController {

    @GetMapping("/odd-nums/{list}")
    public List<Integer> findOddNumbers(@PathVariable List<Integer> list) {
//        List<Integer> nums = Arrays.asList(3,5,10,15,8,2);

        return list.stream()
                .filter(e -> e % 2 != 0)
                .toList();
    }

    @GetMapping("/non-empty-strs/{list}")
    public List<String> findNonEmptyStrings(@PathVariable List<String> list) {
        return list.stream()
                .filter(e -> e != null && !e.isBlank())
                .toList();
    }

}
