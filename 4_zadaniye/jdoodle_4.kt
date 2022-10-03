class Сarnivores(var Name:String, val Weight: Int)
class Herbivores(var Name:String, val AnimalColoring: String)

fun main(){

val Lynx_pardinus=Сarnivores("Рысь Пиренейская",10)
val Ursus_maritimus=Сarnivores("Белый медведь",800)
val Elephas_maximus_indicus=Herbivores("Слон Индийский","Серый")
val Camel=Herbivores("Верблюд","Песочный")

val Carnivores = listOf(Lynx_pardinus,Ursus_maritimus)
val Herbivores = listOf(Elephas_maximus_indicus,Camel)

for(element in Carnivores){
println("${element.Name} Вес животного ${element.Weight} кг")
}
for(element in Herbivores){
println("${element.Name} Цвет окраски ${element.AnimalColoring}")
}

}