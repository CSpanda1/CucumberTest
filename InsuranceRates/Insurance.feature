
@tag
Feature: Insurance rates per customer

	Scenario Outline:
    Given Customer <Customer> signs up
    When If customer age <Age> is greater than 18, apply discount <Discount>
    And If customer has no crashes <no_crashes>, apply discount <Discount>
    And If customers credit score <credit_score> is greater than 600, apply discount <Discount>
    And If customers income <income> is greater than 40000, apply discount <Discount>
    And If customer is military <military>, apply discount <Discount>
    And If customer is a student <student>, apply discount <Discount>
    And If customers vehicle is parked in a garage <parked_garage>, apply discount <Discount>
    And If customers account tenure <account_tenure> is greater than 1 year, apply discount <Discount>
    And If customers safety feature count <safety_features> is greater than 1, apply discount <Discount>
    And If customer signed up for payment autodraft <autodraft>, apply discount <Discount>
    And If customer bundles additional policies <bundle>, apply discount <Discount>
    And If customers yearly mileage <yearly_mileage> is less than 10000 miles per year, apply discount <Discount>
    And If customer does not have a lien <lien> on the vehicle, apply discount <Discount>
    And If customers total vehicle mileage <vehicle_mileage> is less than 20000 miles, apply discount <Discount>
    And If customers vehicle is electric <electric>, apply discount <Discount>
    Then Display total discount

    Examples:
    | Customer | Age | no_crashes | credit_score | income | military | student | parked_garage | account_tenure | safety_features | autodraft | bundle | yearly_mileage | lien  | vehicle_mileage | electric | Discount |
    |  "John"  | 16  |   "True"   |     517      |  38000 |  "False" | "True"  |    "True"     |        0       |        2        |  "False"  | "False"|      11000     |"True" |      21000      | "False"  |     2    |
    |  "Jake"  | 21  |   "False"  |     630      |  42000 |  "True"  | "False" |    "False"    |        0       |        4        |  "True"   | "False"|      13000     |"False"|      14000      | "False"  |     2    |
    |  "Derek" | 34  |   "False"  |     710      |  54000 |  "False" | "False" |    "False"    |        11      |        3        |  "True"   | "False"|      9000      |"False"|      62000      | "False"  |     2    |
    |  "KP"    | 16  |   "True"   |     517      |  38000 |  "False" | "True"  |    "True"     |        0       |        0        |  "False"  | "False"|      11000     |"True" |      21000      | "False"  |     2    |
    | "Manjula"| 21  |   "False"  |     630      |  42000 |  "True"  | "False" |    "False"    |        7       |        4        |  "False"  | "True" |      13000     |"False"|      14000      | "False"  |     2    |
    |  "Lisa"  | 34  |   "False"  |     821      |  54000 |  "False" | "False" |    "False"    |        11      |        4        |  "True"   | "False"|      20000     |"False"|      62000      | "False"  |     2    |
    |  "Ahmed" | 16  |   "True"   |     517      |  38000 |  "False" | "True"  |    "True"     |        0       |        2        |  "False"  | "False"|      7500      |"True" |      100000     | "False"  |     2    |
    |  "Chris" | 21  |   "False"  |     630      |  42000 |  "True"  | "False" |    "False"    |        2       |        1        |  "True"   | "True" |      4000      |"False"|      14000      | "True"   |     2    |
    |  "Rol"   | 99  |   "False"  |     710      |  54000 |  "False" | "False" |    "False"    |        11      |        3        |  "True"   | "False"|      9000      |"False"|      73000      | "True"   |     2    |
    