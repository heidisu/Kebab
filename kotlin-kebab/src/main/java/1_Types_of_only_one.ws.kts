object Salt


// makings stuff with the type
val a = Salt
val c:Salt = Salt
val salts = listOf(a, c, Salt)
val moarsalts : List<Salt> = listOf(a,c)

salts


// A function from salt is roughly as interesting as the type
fun salty(s: Salt): Boolean =
    when (s) {
        is Salt -> true
        else -> true
    }

salty(Salt)

// What is the function salty a function from and to? Can you make it a function to an int or a string?

// Try to make something like this work
// let b = [Pepper; Pepper]
// try to mix salt and pepper in a list and see what happens (it is supposed not to work)
