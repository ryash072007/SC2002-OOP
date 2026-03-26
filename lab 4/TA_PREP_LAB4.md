# Lab 4 TA Prep Notes

## What I implemented
- Part 3.1 Polymorphic Sorting:
  - `Numbers` fixed to sort `Integer[]` (autoboxing from `int` input).
  - `Strings` added to sort `String[]`.
  - `Sorting.insertionSort` changed to descending order.
  - `SalePerson` implemented with `toString`, `equals`, `compareTo` based on lab rules.
  - `WeeklySales` now ranks sales from most to least with last-name tie break.
- Part 3.2 Surface Area:
  - Common `Shape` interface with polymorphic `calculateArea()`.
  - 2D shapes: `Square`, `Rectangle`, `Circle`, `Triangle`.
  - 3D shapes: `Sphere`, `Cuboid`, `Pyramid`, `Cone`, `Cylinder`.
  - `Shape2DApp` and `Shape3DApp` added with user-driven shape entry.
  - Calculation runs only after user selects calculation type.

## What to explain to TA
- Why `Integer[]` was needed in `Numbers`: sorting methods operate on objects that implement `Comparable`, not primitive `int`.
- Why sorting still works with `scan.nextInt()`: Java autoboxing converts `int` to `Integer` automatically.
- `SalePerson.compareTo`:
  - Primary key: `totalSales` (natural ascending comparison in class).
  - Tie-breaker: `lastName` ascending alphabetical.
  - Overall ranking shown descending because insertion sort was modified to descending.
- Polymorphism in shapes:
  - All shapes are handled as `Shape[]`.
  - Each class has its own `calculateArea()` implementation.
  - App does not care about concrete type when summing total area.

## Formula assumptions used
- Circle area: `pi * r^2`
- Triangle area: `0.5 * base * height`
- Rectangle area: `length * breadth`
- Square area: `side^2`
- Sphere surface area: `4 * pi * r^2`
- Cuboid surface area: `2(lb + lh + bh)`
- Cylinder surface area: `2 * pi * r * (r + h)`
- Cone surface area: `pi * r * (r + slantHeight)`, `slantHeight = sqrt(r^2 + h^2)`
- Square-based pyramid surface area:
  - base + 4 identical side triangles (square base only)

## Sample results I got
- `WeeklySales` top rank starts with: `Taylor, Harry: 7300`
- `Shape2DApp` sample option total area: `1564.16`
- `Shape3DApp` supports custom 3D-shape input flow and calculates total surface area from entered data.

## Possible TA questions
- Why not use inheritance between 2D and 3D shapes?
  - I used a shared `Shape` interface for polymorphism; area behavior is unified while dimensions/formulas stay shape-specific.
- Why is pyramid square-based only?
  - The lab specifies a square-based pyramid, so the implementation intentionally does not support rectangular-base pyramid edge cases.
