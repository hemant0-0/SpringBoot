package com.spfirst.spfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
class
SpfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpfirstApplication.class, args);
	}

	@GetMapping("/check")//end points
	public String getData(){
		return "Hello_Hemant";
	}

	@GetMapping("/add/{value1}/{value2}")
	public int getNos(@PathVariable int value1,@PathVariable int value2){
	    return value1+value2;
    }

    @GetMapping("/sub/{value1}/{value2}")
	int getSub(@PathVariable int value1,@PathVariable int value2){
		return value1-value2;
	}
	@GetMapping("/fact/{value1}")
	public int getFact(@PathVariable int value1){
	    int fact=1;
	    for (int i=1; i<=value1;i++)
        {
            fact=fact*i;
        }
	    return fact;
    }
    @GetMapping("/evenodd/{value}")
    public int getEvenOdd(int value){

	            if(value%2==0)
                {
                    return 1 ;
                }else {
                    return 2 ;
                }

    }

}
