package kiryasay.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//замена файла web.xml
public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;//null так как метод не используем
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//сюда подставляем класс конфигурации Spring
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};// "/" так как все http запросы посылаем на dispatcherServlet
    }
}
