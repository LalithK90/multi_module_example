package io.losith.multi_module_example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties( ServiceProperties.class )
public class MultiModuleExampleLibraryService {

  private final ServiceProperties serviceProperties;

  @Autowired
  public MultiModuleExampleLibraryService(ServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
  }

  public String message() {
    return this.serviceProperties.getMessage();
  }
}