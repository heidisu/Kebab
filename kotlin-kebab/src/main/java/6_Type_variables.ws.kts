
fun <T> wat(): T {
    throw NotImplementedError()
}

sealed class Fruit {
    object Apple: Fruit()
    object Pear: Fruit()
}

sealed class Meat {
    object Beef: Meat()
    object Mutton: Meat()
}


// food is a Plate of whatever...
data class Plate<T>(val food: T)

// what is the type of..?
Plate(Fruit.Apple)
Plate(Meat.Mutton)

// TODO is this even possible?
/*
inline fun <reified T>isBeef (plate: Plate<T>): Boolean =
    when(plate){
        is Plate<Meat.Beef> ->
    }
    match f with
| Plate Beef -> true
| Plate Mutton -> false

isBeef (Plate Beef)


type box<'A> = Box of 'A

        Box 1

// can you make a box<food<fruit>>?
// can you make a function from food<meat> to box<fruit>?



type either<'A, 'B> = Left of 'A | Right of 'B

        let fruitOrMeat1 : either<fruit, meat> = Left Apple

// can you make a either<fruit, meat> using the Right constructor?
let fruitOrMeat2 : either<fruit, meat> = wa t

// can you make an either<food<meat>, box<fruit>>?
// (and can you make one using the Left constructor and one using the Right?)




type num<'A>  = Zero of 'A | OneMoreThan of num<'A>
*/

// can you make some zero with false, Five with your name and two of 1 (as in the int)


// Bonus...
// What am I? let weirdo = OneMoreThan( Zero ( OneMoreThan( OneMoreThan( Zero 1))))