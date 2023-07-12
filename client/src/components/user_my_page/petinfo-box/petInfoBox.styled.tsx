import tw from 'tailwind-styled-components';

export const Container = tw.div`
    flex
    w-[300px]    
    px-2
    py-2
    border
    border-gray
    rounded-2xl
    bg-[#ffffff]
`;

export const TextBox = tw.div`
    ml-2
    flex
    flex-col
    justify-center
`;

export const NameBox = tw.div`
    flex
    gap-1
    items-center
`;

export const Name = tw.span`
    font-semibold
    text-base
`;

export const Info = tw.span`
    text-[#d9d9d9]
    text-sm
`;
