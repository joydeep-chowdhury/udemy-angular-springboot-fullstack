package com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.model.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel="productCategory",path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long>
{

}
