package com.firealgo.javastreams.emp.service;

import com.firealgo.javastreams.emp.dao.EmpDao;
import com.firealgo.javastreams.entity.Emp;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Practice service class for Java Stream API exercises.
 * <p>
 * Goal:
 * Implement stream logic yourself method-by-method.
 * <p>
 * Instructions:
 * 1. Read method comment
 * 2. Try solving using Stream API
 * 3. Run and verify output
 * 4. Compare with original EmpService implementation
 */
@Service
public class EmpPracticeService {

    private final EmpDao empDao;

    public EmpPracticeService(EmpDao empDao) {
        this.empDao = empDao;
    }

    // -------------------------------------------------------------------------
    // INTERNAL STREAM HELPERS
    // -------------------------------------------------------------------------

    private Stream<Emp> empStream() {
        return empDao.allEmp().stream();
    }

    private Stream<Emp> duplicateEmpStream() {
        return empDao.allEmpWithDuplicates().stream();
    }

    // -------------------------------------------------------------------------
    // BASIC FETCH OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Returns all employees.
     * <p>
     * Example Output:
     * [Emp{id=1,...}, Emp{id=10,...}]
     */
    public List<Emp> getAllEmp() {

        return empStream().toList();
    }

    /**
     * Returns all employees including duplicates.
     * <p>
     * Example Output:
     * [Emp{id=1,...}, Emp{id=1,...}]
     */
    public List<Emp> getAllEmpWithDuplicates() {

        return List.copyOf(empDao.allEmpWithDuplicates());
    }

    // -------------------------------------------------------------------------
    // FILTER + MAP OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Finds employees earning more than given salary.
     * <p>
     * Example:
     * Input  : salary = 7000
     * Output : [Deep Kumar, Raj Kapoor]
     */
    public List<Emp> findWellPaidEmpList(int salary) {

        return empStream()
                .filter(emp -> emp.getSalary() > salary).toList();
    }

    /**
     * Finds first names of employees earning more than given salary.
     * <p>
     * Example:
     * Input  : salary = 7000
     * Output : [Deep, Raj]
     */
    public List<String> findWellPaidEmpNameList(int salary) {

        return empStream()
                .filter(e -> e.isSalaryGreaterThan(salary))
                .map(Emp::getFirstName)
                .toList();
    }

    // -------------------------------------------------------------------------
    // DISTINCT + SET OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Returns distinct department names.
     * <p>
     * Example Output:
     * [FINANCE, HR, IT]
     */
    public List<String> findDistinctDeptList() {

        return empStream()
                .map(Emp::getDept)
                .distinct()
                .toList();
    }

    /**
     * Returns distinct departments as Set.
     * <p>
     * Example Output:
     * [HR, IT, FINANCE]
     */
    public Set<String> findDeptSet() {

        return empStream()
                .map(Emp::getDept)
                .collect(Collectors.toSet());
    }

    /**
     * Returns distinct employees.
     * <p>
     * Example Output:
     * Duplicate employees removed.
     */
    public List<Emp> findAllDistinctEmp() {
        return duplicateEmpStream().distinct().toList();
    }

    /**
     * Returns distinct employees as Set.
     * <p>
     * Example Output:
     * Unique employee set.
     */
    public Set<Emp> findAllEmpSet() {
        return duplicateEmpStream().collect(Collectors.toSet());
    }

    // -------------------------------------------------------------------------
    // SORTING OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Returns employee first names.
     * <p>
     * Example Output:
     * [Deep, Raj, Krishna]
     */
    public List<String> findEmpFirstNameList() {
        return empStream()
                .map(Emp::getFirstName)
                .toList();
    }

    /**
     * Returns employee full names.
     * <p>
     * Example Output:
     * [Deep Kumar, Raj Kapoor]
     */
    public List<String> findEmpFullNameList() {

        // TODO: Implement logic

        return null;
    }

    /**
     * Returns sorted employee first names.
     * <p>
     * Example Output:
     * [Alia, Asha, Deep, Krishna, Raj]
     */
    public List<String> findEmpFirstNameSortedList() {

        return empStream()
                .map(Emp::getFirstName)
                .sorted()
                .toList();
    }

    /**
     * Returns distinct sorted employee first names.
     * <p>
     * Example Output:
     * [Alia, Asha, Deep, Krishna, Raj]
     */
    public List<String> findEmpFirstNameSortedAndDistinctList() {

        // TODO: Implement logic

        return null;
    }

    /**
     * Returns reverse sorted distinct employee first names.
     * <p>
     * Example Output:
     * [Raj, Krishna, Deep, Asha, Alia]
     */
    public List<String> findEmpFirstNameReverseSortedAndDistinctList() {

        // TODO: Implement logic

        return null;
    }

    /**
     * Returns sorted distinct employee first names as TreeSet.
     * <p>
     * Example Output:
     * [Alia, Asha, Deep, Krishna, Raj]
     */
    public Set<String> findEmpFirstNameSortedAndDistinctSet() {

        // TODO: Implement logic

        return null;
    }

    /**
     * Returns employees sorted by ID.
     * <p>
     * Example Output:
     * Employees sorted in ascending ID order.
     */
    public List<Emp> findEmpSortedByIdList() {

        return empStream().sorted(Comparator.comparingInt(Emp::getId)).toList();
    }

    /**
     * Returns employees reverse sorted by ID.
     * <p>
     * Example Output:
     * Employees sorted in descending ID order.
     */
    public List<Emp> findEmpReverseSortedByIdList() {
        return empStream()
                .sorted(Comparator.comparingInt(Emp::getId).reversed())
                .toList();
    }

    /**
     * Returns employees sorted by full name.
     * <p>
     * Example Output:
     * Employees sorted alphabetically by full name.
     */
    public List<Emp> findEmpSortedByFullNameList() {

        return empStream()
                .sorted(Comparator.comparing(Emp::getFullName))
                .toList()
                ;
    }

    /**
     * Returns distinct employees sorted by full name.
     * <p>
     * Example Output:
     * Unique employees sorted alphabetically.
     */
    public List<Emp> findDistinctEmpSortedByFullNameList() {
        return duplicateEmpStream()
                .distinct()
                .sorted(Comparator.comparing(Emp::getFullName))
                .toList();
    }

    // -------------------------------------------------------------------------
    // JOINING OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Returns comma-separated employee full names.
     * <p>
     * Example Output:
     * Deep Kumar, Raj Kapoor, Krishna Gopal
     */
    public String findCommaSeparatedEmpFullNames() {

        return empStream().map(Emp::getFullName).collect(Collectors.joining(","));
    }

    // -------------------------------------------------------------------------
    // FIND + MATCH OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Finds first employee in given department.
     * <p>
     * Example:
     * Input  : IT
     * Output : Deep Kumar
     */
    public Emp findFirstEmpInDept(String dept) {
        return empStream()
                .filter(e -> e.isInDept(dept))
                .findFirst().orElse(null);
    }

    /**
     * Checks whether any employee in department earns below given salary.
     * <p>
     * Example:
     * Input  : HR, 6000
     * Output : true
     */
    public boolean checkAnyEmpIsLessPaidInGivenDept(String dept, int salary) {

        return empStream()
                .anyMatch(e -> e.isInDept(dept) && e.getSalary() < salary);
    }

    /**
     * Checks whether all employees earn above given salary.
     * <p>
     * Example:
     * Input  : 5000
     * Output : true
     */
    public boolean checkAllEmpGettingGoodSalary(int salary) {
        return empStream()
                .allMatch(e -> e.isSalaryGreaterThan(salary));
    }

    // -------------------------------------------------------------------------
    // MAX / MIN / COUNT OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Finds highest paid employee.
     * <p>
     * Example Output:
     * Emp{id=35, fullName='Raj Kumar', salary=9500, dept='IT'}
     */
    public Emp findHighestPaidEmp() {
        return empStream()
                .max(Comparator.comparingInt(Emp::getSalary))
                .orElse(null)
                ;
    }

    /**
     * Finds lowest paid employee.
     * <p>
     * Example Output:
     * Employee with minimum salary.
     */
    public Emp findLowestPaidEmp() {
        return empStream()
                .min(Comparator.comparingInt(Emp::getSalary))
                .orElse(null)
                ;
    }

    /**
     * Counts employees in given department.
     * <p>
     * Example:
     * Input  : IT
     * Output : 3
     */
    public long findEmpCountInDept(String dept) {
        return empStream().filter(e -> e.isInDept(dept)).count();
    }

    // -------------------------------------------------------------------------
    // AGGREGATION OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Calculates total salary of employees in department.
     * <p>
     * Example:
     * Input  : IT
     * Output : 23500
     */
    public int totalSalaryInDept(String dept) {
        return empStream().filter(e -> e.isInDept(dept)).mapToInt(Emp::getSalary).sum();
    }

    /**
     * Calculates average salary of all employees.
     * <p>
     * Example Output:
     * 7166.66
     */
    public double averageSalaryOfEmps() {

        // TODO: Implement logic

        return empStream().mapToInt(Emp::getSalary).average().orElse(0);
    }

    /**
     * Returns salary statistics of all employees.
     * <p>
     * Example Output:
     * count=6, sum=43000, min=5500, average=7166.66, max=9500
     */
    public IntSummaryStatistics summarizingSalaryOfAllEmps() {
        return empStream().mapToInt(Emp::getSalary).summaryStatistics();
    }

    // -------------------------------------------------------------------------
    // GROUPING OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Groups employees by department.
     * <p>
     * Example Output:
     * {HR=[...], IT=[...], FINANCE=[...]}
     */
    public Map<String, List<Emp>> groupEmpByDept() {
        return empStream().collect(Collectors.groupingBy(Emp::getDept));
    }

    /**
     * Groups employee first names by department.
     * <p>
     * Example Output:
     * {HR=[Raj, Krishna], IT=[Deep, Raj]}
     */
    public Map<String, List<String>> groupEmpFirstNameByDept() {
        return empStream()
                .collect(Collectors.groupingBy(Emp::getDept,
                        Collectors.mapping(Emp::getFirstName,
                                Collectors.toList())));
    }

    /**
     * Calculates total salary by department.
     * <p>
     * Example Output:
     * {HR=13000, IT=23500}
     */
    public Map<String, Integer> totalSalaryByDept() {
        return empStream()
                .collect(Collectors.groupingBy(
                        Emp::getDept,
                        Collectors.summingInt(Emp::getSalary)));
    }

    /**
     * Counts employees by department.
     * <p>
     * Example Output:
     * {HR=2, IT=3}
     */
    public Map<String, Long> empCountByDept() {
        return empStream()
                .collect(Collectors.groupingBy(Emp::getDept,
                        Collectors.counting()));
    }

    // -------------------------------------------------------------------------
    // PARTITIONING OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Partitions employees into well-paid and less-paid groups.
     * <p>
     * Example Output:
     * true  → salary > 7000
     * false → salary <= 7000
     */
    public Map<Boolean, List<Emp>> partitionEmpBySalary() {
        final int sal = 7000;

        return empStream()
                .collect(Collectors.partitioningBy(e -> e.isSalaryGreaterThan(sal)));
    }

    // -------------------------------------------------------------------------
    // MAP OPERATIONS
    // -------------------------------------------------------------------------

    /**
     * Creates map of employee ID to full name.
     * <p>
     * Example Output:
     * {1=Deep Kumar, 10=Raj Kapoor}
     */
    public Map<Integer, String> mapEmpIdToEmpFullName() {
        return empStream()
                .collect(Collectors.toMap(Emp::getId, Emp::getFullName));
    }


    // -------------------------------------------------------------------------
    // ADVANCED STREAM PROBLEMS
    // -------------------------------------------------------------------------

    /**
     * Finds second highest salaried employee.
     * <p>
     * Example Output:
     * Emp{id=1, fullName='Deep Kumar', salary=8500, dept='IT'}
     */
    public Emp findSecondHighestPaidEmp() {

        return empStream().sorted(Comparator.comparingInt(Emp::getSalary).reversed()).skip(1).findFirst().orElse(null);
    }

    /**
     * Finds department having highest total salary.
     * <p>
     * Example Output:
     * IT
     */
    public String findDeptWithHighestTotalSalary() {
        var group = empStream()
                .collect(Collectors.groupingBy(Emp::getDept, Collectors.summingInt(Emp::getSalary)));
        return group.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    /**
     * Finds highest paid employee by department without Optional.
     * <p>
     * Example Output:
     * {
     * HR=Emp{id=10,...},
     * IT=Emp{id=35,...}
     * }
     */
    public Map<String, Emp> highestPaidEmpByDept() {

        // TODO: Implement logic

        return empStream()
                .collect(Collectors.groupingBy(
                        Emp::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparingInt(Emp::getSalary)
                                ),
                                Optional::get
                        )
                ));
    }

    /**
     * Groups employees first by department and then by salary category.
     * <p>
     * Salary Category:
     * HIGH -> salary > 7000
     * LOW  -> salary <= 7000
     * <p>
     * Example Output:
     * {
     * IT={
     * HIGH=[...],
     * LOW=[...]
     * },
     * HR={
     * HIGH=[...]
     * }
     * }
     */
    public Map<String, Map<String, List<Emp>>> groupEmpByDeptAndSalaryCategory() {

        var res = empStream().collect(
                Collectors.groupingBy(Emp::getDept,
                        Collectors.groupingBy(
                                emp -> emp.isSalaryGreaterThan(7000) ? "HIGH" : "LOW"
                        )
                )

        );

        return res;
    }

    /**
     * Finds duplicate employee first names.
     * <p>
     * Example Output:
     * [Raj]
     */
    public List<String> findDuplicateFirstNames() {

        var firstNameFreq = empStream().collect(Collectors.groupingBy(Emp::getFirstName, Collectors.counting()));

        return firstNameFreq.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
    }

    /**
     * Finds top 3 highest paid employees.
     * <p>
     * Example Output:
     * [
     * Emp{id=35,...},
     * Emp{id=1,...},
     * Emp{id=10,...}
     * ]
     */
    public List<Emp> findTop3HighestPaidEmps() {

        return empStream().sorted(Comparator.comparingInt(Emp::getSalary).reversed()).limit(3).toList();
    }

    /**
     * Creates nested map of department -> employee ID -> full name.
     * <p>
     * Example Output:
     * {
     * IT={
     * 1=Deep Kumar,
     * 35=Raj Kumar
     * },
     * HR={
     * 10=Raj Kapoor
     * }
     * }
     */
    public Map<String, Map<Integer, String>>
    mapDeptToEmpIdAndFullName() {
        return empStream().collect(
                Collectors.groupingBy(Emp::getDept, Collectors.toMap(Emp::getId, Emp::getFullName, (v1, v2) -> v2, TreeMap::new))
        );
    }

    /**
     * Finds employees having same salary.
     * <p>
     * Example Output:
     * {
     * 5500=[Emp{id=5,...}, Emp{id=25,...}]
     * }
     */
    public Map<Integer, List<Emp>> findEmployeesWithSameSalary() {
        return empStream().collect(
                Collectors.groupingBy(Emp::getSalary)
        ).entrySet().stream().filter(e -> e.getValue().size() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Partitions employee names into well-paid and less-paid groups.
     * <p>
     * Example Output:
     * {
     * true=[Deep, Raj],
     * false=[Krishna, Asha]
     * }
     */
    public Map<Boolean, List<String>>
    partitionEmpNamesBySalary() {

        return empStream()
                .collect(Collectors.partitioningBy(e -> e.isSalaryGreaterThan(7000), Collectors.mapping(Emp::getFirstName, Collectors.toList())));
    }

    /**
     * Finds employee having longest full name.
     * <p>
     * Example Output:
     * Emp{id=5, fullName='Krishna Gopal', ...}
     */
    public Emp findEmpWithLongestFullName() {
        return empStream().max(Comparator.comparingInt(e -> e.getFullName().length())).orElse(null);
    }

    /**
     * Finds average salary and highest salary together in single stream pass.
     * <p>
     * Example Output:
     * {
     * averageSalary=7166.66,
     * highestSalary=9500
     * }
     */
    public Map<String, Double> findAverageAndHighestSalary() {

        // TODO: Implement logic

        return null;
    }

    /**
     * Finds top 2 highest paid employees in each department.
     * <p>
     * Example Output:
     * {
     * IT=[Emp{id=35,...}, Emp{id=1,...}],
     * HR=[Emp{id=10,...}, Emp{id=5,...}]
     * }
     */
    public Map<String, List<Emp>>
    findTop2HighestPaidEmpByDept() {
        return empStream().collect(
                Collectors.groupingBy(Emp::getDept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted(Comparator.comparingInt(Emp::getSalary).reversed())
                                        .limit(2)
                                        .toList()
                        )
                )
        );
    }

    /**
     * Finds employee whose salary is closest to average salary.
     * <p>
     * Example:
     * Average Salary = 7166.66
     * <p>
     * Salary Difference:
     * 7500 -> 333
     * 6500 -> 666
     * 8500 -> 1333
     * <p>
     * Example Output:
     * Emp{id=10, fullName='Raj Kapoor', salary=7500, dept='HR'}
     */
    public Emp findEmpClosestToAverageSalary() {

        // Step 1 -> Calculate average salary
        double avg = empStream().mapToInt(Emp::getSalary).average().orElse(0);
        // Step 2 -> Find employee having minimum difference
        //           from average salary
        // Step 3 -> Use Math.abs() for difference comparison

        return empStream().min(Comparator.comparingDouble(e -> Math.abs(avg - e.getSalary()))).orElse(null);
    }

    /**
     * Finds average salary of top 3 highest paid employees.
     * <p>
     * Example Output:
     * 8500.0
     */
    public double findAverageSalaryOfTop3HighestPaidEmps() {
        return empStream().sorted(Comparator.comparingInt(Emp::getSalary).reversed()).limit(3)
                .mapToInt(Emp::getSalary)
                .average().orElse(0);
    }

    /**
     * Groups employees by salary range.
     * <p>
     * Salary Range:
     * LOW    -> salary < 6000
     * MEDIUM -> salary between 6000 and 8000
     * HIGH   -> salary > 8000
     * <p>
     * Example Output:
     * {
     * LOW=2,
     * MEDIUM=2,
     * HIGH=2
     * }
     */
    public Map<String, Long> countEmpBySalaryRange() {

        var res = empStream()
                .collect(
                        Collectors.groupingBy(
                                e -> {
                                    if (e.getSalary() < 6000) return "LOW";
                                    else if (e.getSalary() < 8000) {
                                        return "MEDIUM";
                                    } else return "HIGH";
                                },
                                Collectors.counting()
                        )
                );

        return res;
    }

    /**
     * Finds department having maximum employees.
     * <p>
     * Example Output:
     * IT
     */
    public String findDeptHavingMostEmployees() {

        var temp = empStream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));

        return temp.entrySet().stream()
                .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    /**
     * Finds frequency of each salary.
     * <p>
     * Example Output:
     * {
     * 5500=2,
     * 7500=1,
     * 9500=1
     * }
     */
    public Map<Integer, Long> findSalaryFrequencyMap() {

        return empStream().collect(
                Collectors.groupingBy(Emp::getSalary, TreeMap::new, Collectors.counting())
        );
    }

    /**
     * Finds duplicate employee full names.
     * <p>
     * Example Output:
     * [Raj Kumar]
     */
    public List<String> findDuplicateFullNames() {

        var fullNameFreq = empStream().collect(Collectors.groupingBy(Emp::getFullName, Collectors.counting()));

        return fullNameFreq.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
    }

}