package com.firealgo.javastreams.demo;

import com.firealgo.javastreams.dao.EmpDao;
import com.firealgo.javastreams.service.EmpPracticeService;

/**
 * Console playground for testing Java Stream API examples.
 * <p>
 * Usage:
 * 1. Uncomment ONLY ONE test method in main()
 * 2. Run application
 * 3. Observe output
 * <p>
 * This class is intentionally designed for:
 * - learning
 * - experimentation
 * - debugging
 * - interview preparation
 */
public class EmpPracticeServiceDemo {

    /**
     * Service under test.
     */
    private static final EmpPracticeService service =
            new EmpPracticeService(new EmpDao());

    public static void main(String[] args) {

        // -----------------------------------------------------------------
        // Uncomment ONLY ONE method at a time for focused testing
        // -----------------------------------------------------------------

        testGetAllEmployees();
        random();

//         testGetAllEmployeesWithDuplicates();
//         testDistinctDepartments();// Done
//         testWellPaidEmployees(); // Done
//        testFindWellPaidEmpNameList(); // DOne
//        testDepartmentSet(); // Done

//        testEmployeeFirstNameList();

//        testSortedEmployeeNames();
        // testHighestPaidEmployee();
        // testGroupEmployeesByDepartment();
        // testHighestSalaryByDepartment();
        // testPartitionEmployeesBySalary();
        // testEmployeeIdToFullNameMap();
    }

    private static void random() {
        printSection("findSalaryFrequencyMap");
        System.out.println(service.findSalaryFrequencyMap());
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
    // DISTINCT + SET OPERATIONS
    // -------------------------------------------------------------------------

    private static void testDepartmentSet() {

        printSection("DEPARTMENT SET");

        System.out.println(
                service.findDeptSet()
        );
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

    private static void testFindWellPaidEmpNameList() {

        printSection("WELL PAID EMPLOYEES First Name");

        int salaryThreshold = 7000;

        System.out.println(
                service.findWellPaidEmpNameList(salaryThreshold)
        );
    }

    // -------------------------------------------------------------------------
    // MAP OPERATIONS
    // -------------------------------------------------------------------------

    private static void testEmployeeFirstNameList() {

        printSection("EMPLOYEE FIRST NAME LIST");

        System.out.println(
                service.findEmpFirstNameList()
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
    private static void testSortedEmployeeFirstNameList() {

        printSection("SORTED EMPLOYEE FIRST NAME LIST");

        System.out.println(
                service.findEmpFirstNameSortedList()
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
//                service.highestSalaryByDept()
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