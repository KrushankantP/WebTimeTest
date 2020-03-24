/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author PATEL
 */
@Named(value = "webTimeTest")
@Dependent
public class WebTimeTest {

private String Time;

    public WebTimeTest() {
        
        
    }

    public String getTime() {
        return DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
}
