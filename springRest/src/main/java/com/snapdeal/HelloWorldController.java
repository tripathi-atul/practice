package com.snapdeal;


import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import maincontroller.BeanIntializer;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fasterxml.jackson.databind.util.JSONPObject;

import dao.DaoForAppointment1;
import dao.ObjectToDataBase;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(ModelMap model) {
			System.out.println("atul");
			System.out.println("irfan");
			model.addAttribute("msg", "JCG Hello World!");
			return "helloworld";
		}
		
		@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
		public String displayMessage(@PathVariable String msg, ModelMap model) {
			model.addAttribute("msg", msg);
			return "helloworld";
		}
		
		
		    @RequestMapping(value = "/appointmentService", method =  RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		    public @ResponseBody Appointment saveAppointmentToDB(@RequestBody Appointment appointment)
		    { 
		    	
		    	System.out.println("inAppointment");
		    	 DaoForAppointment1 dfa = (DaoForAppointment1)BeanIntializer.ctx.getBean("appointmentDao");
		    	 dfa.saveEmployee(appointment);
		    	 
		    	
		   /*    ObjectToDataBase otd = new ObjectToDataBase();
		       Appointment appointmentSaved = (Appointment)otd.saveObjectToDatabase(appointment);*/
		        return appointment;
		}
		    
		    
		    @RequestMapping(value = "/login", method =  RequestMethod.POST)
		    public @ResponseBody Registration saveRegistrationToDB(Registration registration)
		    { 
		    	
		    System.out.println("inRegistration");
		    return registration;
		   
		    
		}
		    
		    
		    public String decrypt(byte[] message) throws Exception {
		    	
		    	final MessageDigest md = MessageDigest.getInstance("md5");
		    	final byte[] digestOfPassword = md.digest("HG58YZ3CR9"
		    			.getBytes("utf-8"));
		    	final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
		    	for (int j = 0, k = 16; j < 8;) {
		    		keyBytes[k++] = keyBytes[j++];
		    	}

		    	final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
		    	final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
		    	final Cipher decipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		    	decipher.init(Cipher.DECRYPT_MODE, key, iv);

		    	// final byte[] encData = new
		    	// sun.misc.BASE64Decoder().decodeBuffer(message);
		    	final byte[] plainText = decipher.doFinal(message);

		    	return new String(plainText, "UTF-8");
		    }
		    
		
	}