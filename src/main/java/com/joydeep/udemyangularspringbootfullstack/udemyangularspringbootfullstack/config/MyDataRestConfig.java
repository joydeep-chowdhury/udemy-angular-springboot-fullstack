package com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.model.Product;
import com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.model.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer
      {
	         @Override
             public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
             {
            	 HttpMethod[] theunsupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
            	 config.getExposureConfiguration()
            	       .forDomainType(Product.class)
            	       .withItemExposure((metdata,httpMethods)->httpMethods.disable(theunsupportedActions))
            	       .withCollectionExposure((metdata,httpMethods)->httpMethods.disable(theunsupportedActions));
            	 
            
            	 config.getExposureConfiguration()
            	       .forDomainType(ProductCategory.class)
            	       .withItemExposure((metdata,httpMethods)->httpMethods.disable(theunsupportedActions))
            	       .withCollectionExposure((metdata,httpMethods)->httpMethods.disable(theunsupportedActions));
             }
             
      }
