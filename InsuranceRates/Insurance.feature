
@tag
Feature: Insurance rates per customer

	Scenario Outline: <description>
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
    Then Verify actual discount equals expected discount <expected_Dis>

    Examples:
    | Customer | Age | no_crashes | credit_score | income | military | student | parked_garage | account_tenure | safety_features | autodraft | bundle | yearly_mileage | lien  | vehicle_mileage | electric | Discount | expected_Dis |       description      |
    |  "John"  | 16  |   "True"   |     517      |  38000 |  "False" | "True"  |    "True"     |        0       |        2        |  "False"  | "False"|      11000     |"True" |      21000      | "False"  |     2    |       8      |   John - 8% Discount   |
    |  "Jake"  | 21  |   "False"  |     630      |  42000 |  "True"  | "False" |    "False"    |        0       |        4        |  "True"   | "False"|      13000     |"False"|      14000      | "False"  |     2    |      16      |   Jake - 16% Discount  |
    |  "Derek" | 34  |   "False"  |     710      |  54000 |  "False" | "False" |    "False"    |        11      |        3        |  "True"   | "False"|      9000      |"False"|      62000      | "False"  |     2    |      16      |  Derek - 16% Discount  |
    |   "KP"   | 32  |   "False"  |     705      |  72000 |  "False" | "False" |    "False"    |        9       |        0        |  "True"   | "False"|      15000     |"True" |      76000      | "False"  |     2    |      10      |    KP - 10% Discount   |
    | "Manjula"| 30  |   "False"  |     590      |  60000 |  "False" | "False" |    "False"    |        0       |        0        |  "True"   | "True" |      12000     |"True" |      17000      | "True"   |     2    |      12      | Manjula - 12% Discount |
    |  "Lisa"  | 34  |   "False"  |     585      |  36000 |  "False" | "False" |    "False"    |        0       |        0        |  "False"  | "False"|      11000     |"True" |      82000      | "False"  |     2    |       2      |   Lisa - 2% Discount   |
    |  "Ahmed" | 21  |   "True"   |     532      |  36000 |  "False" | "False" |    "False"    |        0       |        0        |  "False"  | "False"|      11000     |"True" |      100000     | "False"  |     2    |       4      |   Ahmed - 4% Discount  |
    |  "Chris" | 21  |   "True"   |     610      |  36000 |  "False" | "False" |    "False"    |        0       |        0        |  "False"  | "False"|      14000     |"True" |      21000      | "False"  |     2    |       6      |   Chris - 6% Discount  |
    |   "Rol"  | 99  |   "True"   |     710      |  54000 |  "False" | "False" |    "False"    |        0       |        0        |  "False"  | "False"|      12000     |"True" |      73000      | "False"  |     2    |       8      |    Rol - 8% Discount   |
    | "Crystal"| 33  |   "True"   |     717      |  54000 |  "True"  | "False" |    "False"    |        0       |        0        |  "False"  | "False"|      13000     |"True" |      71000      | "False"  |     2    |      10      | Crystal - 10% Discount |
    | "Yasmine"| 21  |   "True"   |     634      |  54000 |  "True"  | "True"  |    "False"    |        0       |        0        |  "False"  | "False"|      11000     |"True" |      21000      | "False"  |     2    |      12      | Yasmine - 12% Discount |
    |  "Faith" | 21  |   "True"   |     660      |  54000 |  "True"  | "True"  |    "True"     |        0       |        0        |  "False"  | "False"|      15000     |"True" |      22000      | "False"  |     2    |      14      |  Faith - 14% Discount  |
    | "Dakota" | 21  |   "True"   |     699      |  54000 |  "True"  | "True"  |    "True"     |        2       |        0        |  "False"  | "False"|      16000     |"True" |      34000      | "False"  |     2    |      16      |  Dakota - 16% Discount |
    |  "Sean"  | 45  |   "True"   |     705      |  60000 |  "True"  | "True"  |    "True"     |        4       |        5        |  "False"  | "False"|      12000     |"True" |      66000      | "False"  |     2    |      18      |   Sean - 18% Discount  |
    | "Lindsey"| 55  |   "True"   |     608      |  42000 |  "True"  | "True"  |    "True"     |        3       |        3        |  "True"   | "False"|      18000     |"True" |      89000      | "False"  |     2    |      20      | Lindsey - 20% Discount |
    | "Malcolm"| 37  |   "True"   |     742      |  68000 |  "True"  | "True"  |    "True"     |        10      |        4        |  "True"   | "True" |      14000     |"True" |      120000     | "False"  |     2    |      22      | Malcolm - 22% Discount |
    |  "Mary"  | 67  |   "True"   |     677      |  62000 |  "True"  | "True"  |    "True"     |        7       |        5        |  "True"   | "True" |      8000      |"True" |      76000      | "False"  |     2    |      24      |   Mary - 24% Discount  |
    | "Joanne" | 44  |   "True"   |     723      |  57000 |  "True"  | "True"  |    "True"     |        2       |        4        |  "True"   | "True" |      9500      |"False"|      52000      | "False"  |     2    |      26      |  Joanne - 26% Discount |
    |  "Simon" | 29  |   "True"   |     702      |  78000 |  "True"  | "True"  |    "True"     |        3       |        6        |  "True"   | "True" |      4500      |"False"|      18000      | "False"  |     2    |      28      |  Simon - 28% Discount  |
    | "Patrick"| 24  |   "True"   |     632      |  48000 |  "True"  | "True"  |    "True"     |        2       |        2        |  "True"   | "True" |      7000      |"False"|      14000      | "True"   |     2    |      30      | Patrick - 30% Discount |
    