package com.firealgo.javastreams.demo;

import com.firealgo.javastreams.dao.EmpDao;
import com.firealgo.javastreams.service.EmpService;

/**
 * Console playground for testing Java Stream API examples.
 *
 * Usage:
 * 1. Uncomment ONLY ONE test method in main()
 * 2. Run application
 * 3. Observe output
 *
 * This class is intentionally designed for:
 * - learning
 * - experimentation
 * - debugging
 * - interview preparation
 */
public class EmpServiceDemo {

    /**
     * Service under test.
     */
    private static final EmpService service =
            new EmpService(new EmpDao());

    public static void main(String[] args) {

        // -----------------------------------------------------------------
        // Uncomment ONLY ONE method at a time for focused testing
        // -----------------------------------------------------------------

        testGetAllEmployees();

//         testGetAllEmployeesWithDuplicates();
        // testDistinctDepartments();
         testWellPaidEmployees();
        // testSortedEmployeeNames();
        // testHighestPaidEmployee();
        // testGroupEmployeesByDepartment();
        // testHighestSalaryByDepartment();
        // testPartitionEmployeesBySalary();
        // testEmployeeIdToFullNameMap();
    }

    // -------------------------------------------------------------------------
    // BASIC OPERATIONS
    // -------------------------------------------------------------------------

    private static void testGetAllEmployees() {

        printSection("ALL EMPLOYEES");

        System.out.println(service.getAllEmp());
    }

    private static void testGetAllEmployeesWithDuplicates() {

        printSection("ALL EMPLOYEES WITH DUPLICATES");

        System.out.println(service.getAllEmpWithDuplicates());
    }

    // -------------------------------------------------------------------------
    // DISTINCT OPERATIONS
    // -------------------------------------------------------------------------

    private static void testDistinctDepartments() {

        printSection("DISTINCT DEPARTMENTS");

        System.out.println(service.findDistinctDeptList());
    }

    // -------------------------------------------------------------------------
    // FILTER OPERATIONS
    // -------------------------------------------------------------------------

    private static void testWellPaidEmployees() {

        printSection("WELL PAID EMPLOYEES");

        int salaryThreshold = 7000;

        System.out.println(
                service.findWellPaidEmpList(salaryThreshold)
        );
    }

    // -------------------------------------------------------------------------
    // SORTING OPERATIONS
    // -------------------------------------------------------------------------

    private static void testSortedEmployeeNames() {

        printSection("SORTED EMPLOYEE FULL NAMES");

        System.out.println(
                service.findEmpSortedByFullNameList()
        );
    }

    // -------------------------------------------------------------------------
    // AGGREGATION OPERATIONS
    // -------------------------------------------------------------------------

    private static void testHighestPaidEmployee() {

        printSection("HIGHEST PAID EMPLOYEE");

        System.out.println(
                service.findHighestPaidEmp()
        );
    }

    // -------------------------------------------------------------------------
    // GROUPING OPERATIONS
    // -------------------------------------------------------------------------

    private static void testGroupEmployeesByDepartment() {

        printSection("GROUP EMPLOYEES BY DEPARTMENT");

        System.out.println(
                service.groupEmpByDept()
        );
    }

    private static void testHighestSalaryByDepartment() {

        printSection("HIGHEST SALARY BY DEPARTMENT");

        System.out.println(
                service.highestSalaryByDept()
        );
    }

    // -------------------------------------------------------------------------
    // PARTITIONING OPERATIONS
    // -------------------------------------------------------------------------

    private static void testPartitionEmployeesBySalary() {

        printSection("PARTITION EMPLOYEES BY SALARY");

        System.out.println(
                service.partitionEmpBySalary()
        );
    }

    // -------------------------------------------------------------------------
    // MAP OPERATIONS
    // -------------------------------------------------------------------------

    private static void testEmployeeIdToFullNameMap() {

        printSection("EMPLOYEE ID TO FULL NAME MAP");

        System.out.println(
                service.mapEmpIdToEmpFullName()
        );
    }

    // -------------------------------------------------------------------------
    // COMMON UTILITY
    // -------------------------------------------------------------------------

    /**
     * Prints formatted console section title.
     */
    private static void printSection(String title) {

        System.out.println();
        System.out.println("==================================================");
        System.out.println(title);
        System.out.println("==================================================");
    }
}