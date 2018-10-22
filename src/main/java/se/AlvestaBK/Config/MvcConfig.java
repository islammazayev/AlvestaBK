package se.AlvestaBK.Config;

import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
    public class MvcConfig implements WebMvcConfigurer {

        public void addViewControllers(ViewControllerRegistry registry) {   
            registry.addViewController("/").setViewName("Page_AlvestaBK_start_side/AlvestaBKStartSida");
            registry.addViewController("/alvestabk").setViewName("Page_AlvestaBK_start_side/AlvestaBKStartSida");
            registry.addViewController("/home").setViewName("Page_AlvestaBK_start_side/AlvestaBKStartSida");
            registry.addViewController("/foto").setViewName("Page_Image/Foto");
            registry.addViewController("/video").setViewName("Page_Video/Video");
            registry.addViewController("/ourSponsor").setViewName("Page_our_Sponsors/Sponsor");
            registry.addViewController("/about").setViewName("Page_about_us/omAlvestaBK");
            registry.addViewController("/getSponsor").setViewName("Page_get_Sponsor/BliSponsor");


            registry.addViewController("/admin").setViewName("Page_AlvestaBK_start_side/AlvestaBKStartSida");
            registry.addViewController("/login").setViewName("login");
    }

    // @Override
    // public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //     registry
    //       .addResourceHandler("/resources/static/**")
    //       .addResourceLocations("/resources/static/"); 
    // }

}