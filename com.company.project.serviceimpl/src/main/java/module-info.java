module com.company.project.serviceimpl {
	requires transitive com.company.project.service;

	requires httpclient;
	
	provides com.company.project.service.ProductService with  com.company.project.serviceimpl.ProductServiceImpl;
	
    exports com.company.project.serviceimpl;
}
