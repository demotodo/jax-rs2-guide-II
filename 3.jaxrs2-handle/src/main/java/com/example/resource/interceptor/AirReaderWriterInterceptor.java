package com.example.resource.interceptor;

import org.apache.log4j.Logger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.*;
import java.io.IOException;

@Provider
public class AirReaderWriterInterceptor implements ReaderInterceptor, WriterInterceptor {
    private static final Logger LOGGER = Logger.getLogger(AirReaderWriterInterceptor.class);

    public AirReaderWriterInterceptor() {
        LOGGER.info("AirReaderWriterInterceptor initialized " + this);
    }

    @Override
    public Object aroundReadFrom(final ReaderInterceptorContext context) throws IOException, WebApplicationException {
        Object entity = context.proceed();
        LOGGER.debug("aroundReadFrom " + this);
        LOGGER.debug(entity);
        return entity;
    }

    @Override
    public void aroundWriteTo(final WriterInterceptorContext context) throws IOException, WebApplicationException {
        LOGGER.debug("aroundWriteTo " + this);
        LOGGER.debug(context.getEntity());
        context.proceed();
    }
}
