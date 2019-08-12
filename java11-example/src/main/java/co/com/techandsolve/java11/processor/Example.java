package co.com.techandsolve.java11.processor;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Example {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ProcessHandle currentProcess = ProcessHandle.current();

        System.out.println("Process PID = " + currentProcess.pid());

        Process newProcess = new ProcessBuilder(List.of("java", "-v")).start();
        ProcessHandle handle = newProcess.toHandle();
        handle.onExit()
                .whenComplete((processHandle, throwable) ->
                System.out.println(processHandle.pid()))
                .get();

    }

}
