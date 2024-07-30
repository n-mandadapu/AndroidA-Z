package basics

fun main(){
    searchFor("java developer") // default parametre
    searchFor("java dv","Bing")
    searchFor(searchEngine = "bing", search = "ava dev") // named parametres
}

fun searchFor(search: String,searchEngine:String="Google"){
    println("Search for $search on $searchEngine")
}