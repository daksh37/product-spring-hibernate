package com.cts.product.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//for ds related 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		//db related stuff
		// TODO Auto-generated method stub
		return new Class[]{AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		//servlet related stuff
		
		return new Class[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"} ;
	}
	
	

	
}
