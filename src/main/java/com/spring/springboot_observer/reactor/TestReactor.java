package com.spring.springboot_observer.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

public class TestReactor {
    public static void main(String[] args) {

        Flux.just(1,2,3,4).subscribe(System.out ::print);
        Mono.just(1).subscribe(System.out ::print);

        Flux.fromArray(new Integer [] {
                13,243,2,54,35,436
        }).subscribe(System.out::print);

        Flux.fromIterable(new ArrayList<String>(){{
            add("nihao");
            add("nihao2");
        }}).subscribe(System.out ::print);

        Flux.fromStream(new ArrayList<String>(){{
            add("nihao1");
            add("nihao2");
        }}.stream()).subscribe(System.out::print);

        Flux.error(new Exception("nihao"));


    }
}
