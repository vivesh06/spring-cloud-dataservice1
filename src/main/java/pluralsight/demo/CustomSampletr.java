package pluralsight.demo;

import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.Span;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomSampletr {

	@Bean
	public Sampler getCustom() {
		return new Sampler() {
			
			@Override
			public boolean isSampled(Span arg0) {
				System.out.println("custom sampler");
				//you may specify conditions to sample
				return true;
			}
		};
	}
	
	
}
