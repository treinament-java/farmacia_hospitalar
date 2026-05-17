package com.senai.backend.farmacia_hospitalar.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Farmácia Hospitalar API",
        version = "1.0",
        description = "API para gerenciamento de farmácia hospitalar, incluindo operações de CRUD para medicamentos, gerenciamentos e históricos."
    )
)
public class Swagger {
    
}
