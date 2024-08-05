package com.todobackend.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //for healthCheck
    @RequestMapping("/")
    public String home(){
        String originalText = "The Server is up and running....히어로즈 오브 더 스☆톰♚♚가입시$$전원 카드팩☜☜뒷면100%증정※ ♜월드오브 워크래프트♜펫 무료증정￥ 특정조건 §§디아블로3§§★공허의유산★초상화획득기회@@@ 즉시이동http://kr.battle.net/heroes/ko/.";
        
        StringBuilder result = new StringBuilder();
        String[] lines = originalText.split("(?<=\\G.{100})"); // 100자마다 나누기
        
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int cutLength = i * 2;
            if (cutLength < line.length()) {
                line = line.substring(cutLength, line.length() - cutLength);
                result.append(String.format("%"+cutLength+"s%s%n", "", line));
            } else {
                break;
            }
        }
        
        return result.toString();
    }
}