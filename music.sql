drop database if exists music;
create database music;
USE music;

create table RecordLabel (
Label_ID int not null,
LabelName char(20) not null,
LabelAddress char(20) not null,
LabelTel int not null,
primary key(Label_ID)
);

create table Artist (
ArtistName varchar(20) not null,
Artist_ID int auto_increment not null,
Country char(20) not null,
Gender char(20),
age int not null,
Label_ID int not null,
primary key (artist_ID),
foreign key(Label_ID) references recordlabel(Label_ID)
);

create table Album (
AlbumTitel char(20) not null,
Album_ID int not null,
AlbumGenre char(20) not null,
Artist_ID int not null,
Label_ID int not null,
primary key(album_ID),
foreign key (Artist_ID) references artist (artist_ID),
foreign key (label_ID) references recordlabel(label_ID)
);

create table Tracks (
TrackTitle char(20) not null,
Track_ID int not null,
TrackDuration int not null,
Artist_ID int not null,
primary key(track_id),
foreign key(artist_ID) references artist(artist_ID)
);

Insert into recordlabel values
(1, "Deathrow Records", "Pensylvania avenue 1", 12345678);

insert into artist values
("Mac Miller",	1,	"USA"	,"Male",	26, 1),
("Kendrick Lamar"	,2,	"USA",	"Male",	37, 1),
("Kanye AKA yeezy",	3,	"USA", "Male",	47, 1),
("The Notorious B.I.G.",	4,	"USA",	"Male",	27, 1),
("Tupac",	5,	"USA",	"Male",	26, 1),
("Freddie Gibbs	", 6, 	"USA",	"Male",	41, 1),
("Vince Staples"	,7,	"USA",	"Male",	28, 1),
("Ice Cube",	8,	"USA",	"Male",	52, 1 ),
("Future"	,9,	"USA",	"Male",	39, 1),
("Lauryn Hill",	10,	"USA",	"Female",	49,1 );



 





