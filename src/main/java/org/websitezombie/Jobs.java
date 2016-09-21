package org.websitezombie;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

/**
 * Created by gustiamanda on 9/19/16.
 */
public class Jobs {
    @Parameter(names={"--run", "-r"})
    String run;
    @Parameter(names={"--every", "-t"})
    String every;
    public static void main(String[] args){
        Jobs jobs = new Jobs();
        new JCommander(jobs, args);
        jobs.run();

    }

    public void run(){
        System.out.println(run);
        System.out.println(every);
    }
}
