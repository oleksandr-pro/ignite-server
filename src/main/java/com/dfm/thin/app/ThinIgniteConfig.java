package com.dfm.thin.app;


import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThinIgniteConfig {

    @Bean(destroyMethod = "close")
    public Ignite igniteInstance() {
        Ignite ignite = Ignition.start("thin-server-server.xml");
        System.out.println(">>> Loading caches...");

        System.out.println(">>> Loading cache: ProductCache");
        ignite.cache("ProductCache").loadCache(null);

        System.out.println(">>> Loading cache: ProductTagsCache");
        ignite.cache("ProductTagsCache").loadCache(null);

        System.out.println(">>> Loading cache: ProductTypeCache");
        ignite.cache("ProductTypeCache").loadCache(null);

        System.out.println(">>> Loading cache: PropertyCache");
        ignite.cache("PropertyCache").loadCache(null);

        System.out.println(">>> Loading cache: PropertyValueCache");
        ignite.cache("PropertyValueCache").loadCache(null);

        System.out.println(">>> Loading cache: TagCache");
        ignite.cache("TagCache").loadCache(null);

        System.out.println(">>> All caches loaded!");

        return ignite;
    }
}