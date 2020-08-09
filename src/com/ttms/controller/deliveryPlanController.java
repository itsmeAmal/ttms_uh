/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttms.controller;

import com.ttms.daoimpl.deliveryPlanDaoImpl;
import com.ttms.model.deliveryPlan;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author personal
 */
public class deliveryPlanController {

    public static int addDeliveryPlan(int deliveryPlanId, String levelString, int deliveryPlanModuleId,
            boolean repeatStudentsAvailable, Date weekBeginingDate, String calenderWeek, String classContactWeek,
            int year, String type, int lecturerId, BigDecimal lectureHours, int roomId,
            String remark, String day1, String day2, String day3, String day4, String day5) throws SQLException {
        deliveryPlan plan = new deliveryPlan();
        plan.setId(deliveryPlanId);
        plan.setLevelString(levelString);
        plan.setModuleId(deliveryPlanModuleId);
        plan.setRepeatStudentsAvailable(repeatStudentsAvailable);
        plan.setWeekBeginingDate(weekBeginingDate);
        plan.setCalenderWeek(calenderWeek);
        plan.setClassContactWeek(classContactWeek);
        plan.setYear(year);
        plan.setType(type);
        plan.setLecturerId(lecturerId);
        plan.setLectureHours(lectureHours);
        plan.setRoomId(roomId);
        plan.setRemark(remark);
        plan.setDay1(day1);
        plan.setDay2(day2);
        plan.setDay3(day3);
        plan.setDay4(day4);
        plan.setDay5(day5);
        return new deliveryPlanDaoImpl().addDeliveryPlan(plan);
    }

    public static ResultSet getAllDeliveryPlans() throws SQLException {
        return new deliveryPlanDaoImpl().getAllDeliveryPlanDetails();
    }

    public static ResultSet getAllDeliveryPlansWithJoinTables() throws SQLException {
        return new deliveryPlanDaoImpl().getAllDeliveryPlansWithJoinTables();
    }

}
