package com.yupi.template.config;

import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DashScope 模型配置
 * 支持自定义模型名称，包括免费模型
 *
 * @author <a href="https://codefather.cn">编程导航学习圈</a>
 */
@Configuration
public class DashScopeModelConfig {

    @Value("${spring.ai.dashscope.chat.options.model:qwen3.6-flash}")
    private String modelName;

    @Bean
    public DashScopeChatOptions dashScopeChatOptions() {
        return DashScopeChatOptions.builder()
                .model(modelName)
                .build();
    }
}
