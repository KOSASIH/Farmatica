package com.kosasih.farmatica;

import com.kosasih.farmatica.FarmaticaApp;
import com.kosasih.farmatica.config.AsyncSyncConfiguration;
import com.kosasih.farmatica.config.EmbeddedElasticsearch;
import com.kosasih.farmatica.config.EmbeddedKafka;
import com.kosasih.farmatica.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { FarmaticaApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
