package com.alibaba.csp.sentinel.dashboard.transpot.fetch.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_APOLLO;
import static com.alibaba.csp.sentinel.dashboard.Constants.FETCHER;
import static com.alibaba.csp.sentinel.dashboard.Constants.SYSTEM_RULE;

/**
 * fetch system rule by apollo
 *
 * @author longqiang
 */
@Component(DATASOURCE_APOLLO + SYSTEM_RULE + FETCHER)
@ConditionalOnProperty(name = "disableApollo", havingValue = "false", matchIfMissing = true)
public class ApolloSystemRuleFetcher extends ApolloFetchAdapter<SystemRuleEntity> {
}
