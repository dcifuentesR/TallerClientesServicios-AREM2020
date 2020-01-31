package edu.escuelaing.arem.tallerCS;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class URLParser 
{
    public static void main( String[] args ) throws MalformedURLException
    {
    	URL myURL = new URL("http://dcifuentes@campusvirtual.escuelaing.edu.co:80/moodle/mod/resource/view.php?id=34761#trabajando_con_urls");
    	String info[] = new String[] {"Protocol: "+ myURL.getProtocol(),
    			"Authority: "+myURL.getAuthority(),
    			"Host: "+ myURL.getHost(),
    			"Port: "+myURL.getPort(),
    			"Path: "+myURL.getPath(),
    			"Query: "+ myURL.getQuery(),
    			"File: "+myURL.getFile(),
    			"Ref: "+myURL.getRef()};
    	
    	for(String s:info)
    		System.out.println(s);
    	
    }
}
