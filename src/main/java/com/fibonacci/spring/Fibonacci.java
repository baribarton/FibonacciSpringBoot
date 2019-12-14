package com.fibonacci.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Handles Fibonacci calculations and output
 */
@Controller
public class Fibonacci {

    /**
     * Calculates a sequence of n Fibonacci numbers and returns it as a string where n is the passed value
     *
     * @param number The amount of Fibonacci numbers to calculate
     * @return The first n fibonacci numbers as a String
     */
    @RequestMapping(value = "/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String getFibonacciNumber(@PathVariable int number) {
        if (number < 0 || number > 4999) {
            return StringsUtil.INVALID_FIBONACCI_INPUT;
        } else if (number == 0) {
            return "[]";
        } else if (number == 1) {
            return "[0]";
        }

        BigInteger[] fibonacciNumbers = new BigInteger[number];

        // Calculate Fibonacci sequence
        fibonacciNumbers[0] = new BigInteger("0");
        fibonacciNumbers[1] = new BigInteger("1");
        for (int i = 2; i < number; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1].add(fibonacciNumbers[i - 2]);
        }

        return Arrays.toString(fibonacciNumbers);
    }
}
