package com.message.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

public class AuditingFilter extends GenericFilterBean {

    public static final Logger LOG = LoggerFactory.getLogger(AuditingFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);

        long elapsed = new Date().getTime() - start;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.debug("Request[uri=" + request.getRequestURI() + ", method="
                +
                request.getMethod() + "] completed in " + elapsed + " ms");
        LOG.debug("Request[uri=" + request.getRequestURI() + ", method="
                +
                request.getMethod() + "] completed in " + elapsed + " ms");
    }
}
