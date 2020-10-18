package com.kongmu373.csvdemo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/date")
public class CalendarDemoController {


    @RequestMapping(path = "reports/daily", method = RequestMethod.GET)
    public String getDailyReport(
            @RequestParam ("start_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("end_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        Date date = Date.valueOf(startDate);

        System.out.println(date.getTime());
        System.out.println("----");
        LocalDate localDate = date.toLocalDate();
        System.out.println(localDate);
        return "start_date: " + startDate + ", end_date: " + endDate;



    }

    @GetMapping("/local-date")
    public void localDate(@RequestParam("localDate")
                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate) {
        // ...
    }
    public static void main(String[] args) {
        Utils appUtil = new Utils();
        List<Order> orders = IntStream.rangeClosed(1, 10)
                                     .mapToObj(i -> new Order(appUtil.generateRandomInteger(i),
                                             appUtil.generateRandomInteger(i),
                                             appUtil.generateRandomInteger(i),
                                             appUtil.generateRandomInteger(i),
                                             appUtil.generateRandomInteger(i))).collect(Collectors.toList());
        System.out.println(orders);
        System.out.println("-----");
        OrderDto orderDto = new OrderDto();
        for (Order order : orders) {
            orderDto.getAs().add(order.getA());
            orderDto.getBs().add(order.getB());
            orderDto.getCs().add(order.getC());
            orderDto.getDs().add(order.getD());
            orderDto.getEs().add(order.getE());
        }
        System.out.println(orderDto);
        LocalDate now = LocalDate.now();
    }

    private static long yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTimeInMillis();
    }
}
